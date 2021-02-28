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
package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PuppyModel
import com.example.androiddevchallenge.data.arrayPuppies
import com.example.androiddevchallenge.ui.MyHeaderBar

@Composable
fun PuppyDetailsParent(puppyId: Int, onBackClick: () -> Unit) {
    val puppy = arrayPuppies.singleOrNull { it.puppyId == puppyId }
    MyHeaderBar(
        strTitle = "Puppy Details",
        backButtonComposable = {
            // navigation icon is use
            // for drawer icon.
            IconButton(onClick = onBackClick) {
                // below line is use to
                // specify navigation icon.
                Icon(Icons.Filled.ArrowBack, "Back")
            }
        },
        content = {
            PuppyDetailsBody(puppy = puppy)
        }
    )
}

@Composable
fun PuppyDetailsBody(puppy: PuppyModel?) {
    Column {
        puppy?.let { puppyModelNotNull ->
            PuppyDetailsCard(puppyModel = puppyModelNotNull)
        }
    }
}

@Composable
fun PuppyInformation(strPrefix: String, strInfo: String) {
    Column {
        MyDivider()
        Row(modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)) {

            // Title
            Text(
                modifier = Modifier.width(100.dp),
                text = strPrefix,
                style = MaterialTheme.typography.subtitle1,
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )

            // Information
            Text(
                text = strInfo,
                modifier = Modifier.padding(start = 8.dp),
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun PuppyDetailsCard(puppyModel: PuppyModel) {
    Card(
        modifier = Modifier.padding(all = 16.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 3.dp
    ) {
        Column(modifier = Modifier.padding(all = 16.dp)) {

            // Puppy Main Info - Image, Name and Temperament
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
            ) {

                // Puppy Image Top
                Image(
                    painter = painterResource(id = puppyModel.puppyImageRes),
                    contentDescription = puppyModel.puppyName,
                    modifier = Modifier
                        .height(120.dp)
                        .width(120.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )

                // Puppy Main Info - Name and Temperament
                Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {

                    // Puppy Name
                    Text(
                        text = puppyModel.puppyName,
                        style = MaterialTheme.typography.h6,
                        fontWeight = FontWeight.Bold
                    )

                    // Puppy Temperament
                    Text(
                        text = puppyModel.puppyTemperament ?: "",
                        modifier = Modifier.padding(top = 4.dp),
                        style = MaterialTheme.typography.body1,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 16.dp))

            PuppyInformation(
                strPrefix = "Group :",
                strInfo = puppyModel.puppyGroup ?: "N/A"
            )
            PuppyInformation(
                strPrefix = "Height :",
                strInfo = puppyModel.puppyHeight ?: "N/A"
            )
            PuppyInformation(
                strPrefix = "Weight :",
                strInfo = puppyModel.puppyWeight ?: "N/A"
            )
            PuppyInformation(
                strPrefix = "Life :",
                strInfo = puppyModel.puppyLifeExpectancy ?: "N/A"
            )

            MyDivider()
        }
    }
}

@Composable
fun MyDivider() {
    Divider(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .background(Color.Gray)
            .height(0.8.dp)
    )
}
