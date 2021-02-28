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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PuppyModel
import com.example.androiddevchallenge.data.arrayPuppies
import com.example.androiddevchallenge.ui.MyHeaderBar

@Composable
fun PuppyListParent(onItemClick: (model: PuppyModel) -> Unit) {
    MyHeaderBar(
        strTitle = "Popular Puppies",
        content = {
            PuppyListBody(onItemClick = onItemClick)
        }
    )
}

@Composable
fun PuppyListBody(onItemClick: (model: PuppyModel) -> Unit) {
    Column {
        PuppyList(arrayPuppies = arrayPuppies, onItemClick = onItemClick)
    }
}

@Composable
fun PuppyList(arrayPuppies: List<PuppyModel>, onItemClick: (model: PuppyModel) -> Unit) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(bottom = 16.dp, top = 16.dp)
    ) {
        items(arrayPuppies) { puppyModel ->
            PuppyItem(puppyModel = puppyModel, onItemClick = onItemClick)
        }
    }
}
