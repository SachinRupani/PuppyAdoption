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

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.darkThemeSurfaceColor
import com.example.androiddevchallenge.ui.theme.lightThemeSurfaceColor

@Composable
fun MyHeaderBar(
    strTitle: String,
    backButtonComposable: @Composable (() -> Unit)? = null,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { TitleText(strTitle = strTitle) },
                backgroundColor = if (MaterialTheme.colors.isLight) lightThemeSurfaceColor else darkThemeSurfaceColor,
                elevation = 4.dp,
                navigationIcon = backButtonComposable
            )
        },
        content = content

    )
}

@Composable
fun TitleText(strTitle: String) {
    Text(
        text = strTitle,
        fontWeight = FontWeight.Bold,
    )
}
