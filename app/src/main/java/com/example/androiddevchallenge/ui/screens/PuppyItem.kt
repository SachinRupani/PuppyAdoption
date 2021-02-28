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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PuppyModel

@Composable
fun PuppyItem(puppyModel: PuppyModel, onItemClick: (model: PuppyModel) -> Unit) {
    Card(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 3.dp
    ) {
        Row(
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .clickable {
                    onItemClick(puppyModel)
                }
                .padding(all = 8.dp)

        ) {
            PuppyImage(puppyModel = puppyModel)
            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
                PuppyName(puppyModel = puppyModel)
                PuppySubtitle(puppyModel = puppyModel)
            }
        }
    }
}

@Composable
fun PuppyImage(puppyModel: PuppyModel) {
    Image(
        painter = painterResource(id = puppyModel.puppyImageRes),
        contentDescription = puppyModel.puppyName,
        modifier = Modifier
            .fillMaxHeight()
            .width(72.dp)
            .clip(RoundedCornerShape(8.dp)),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun PuppyName(puppyModel: PuppyModel) {
    Text(
        text = puppyModel.puppyName,
        style = MaterialTheme.typography.subtitle1,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun PuppySubtitle(puppyModel: PuppyModel) {
    Text(
        text = puppyModel.puppyTemperament ?: "N/A",
        modifier = Modifier.padding(top = 4.dp),
        style = MaterialTheme.typography.subtitle2,
        color = Color.Gray,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}
