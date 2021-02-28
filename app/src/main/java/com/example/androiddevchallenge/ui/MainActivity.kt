/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.screens.PuppyDetailsParent
import com.example.androiddevchallenge.ui.screens.PuppyListParent
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    val navController = rememberNavController()
    Surface(color = MaterialTheme.colors.background) {
        NavHost(
            navController = navController,
            startDestination = "puppies"
        ) {
            composable(route = "puppies") {
                PuppyListingScreen(navController = navController)
            }
            composable(
                route = "puppies/{id}",
                arguments = listOf(navArgument("id") { type = NavType.IntType })
            ) { backStackEntry ->
                PuppyDetailsScreen(
                    navController = navController,
                    puppyId = backStackEntry.arguments?.getInt("id") ?: 0
                )
            }
        }
    }
}

@Composable
fun PuppyListingScreen(navController: NavController) {
    PuppyListParent(
        onItemClick = { puppyModelClicked ->
            navController.navigate("puppies/${puppyModelClicked.puppyId}")
        }
    )
}

@Composable
fun PuppyDetailsScreen(navController: NavController, puppyId: Int) {
    PuppyDetailsParent(
        puppyId = puppyId,
        onBackClick = {
            navController.popBackStack()
        }
    )
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
