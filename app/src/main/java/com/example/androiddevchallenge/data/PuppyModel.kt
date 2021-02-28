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
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

data class PuppyModel(
    val puppyId: Int,
    val puppyName: String,
    val puppyImageRes: Int,
    var puppyGroup: String? = null,
    var puppyHeight: String? = null,
    var puppyWeight: String? = null,
    var puppyLifeExpectancy: String? = null,
    var puppyTemperament: String? = null
)

val arrayPuppies = arrayListOf(
    PuppyModel(
        puppyId = 1,
        puppyName = "Beagles",
        puppyImageRes = R.drawable.beagle_puppy,
        puppyGroup = "Hound Group",
        puppyHeight = "13 – 15 inches",
        puppyWeight = "20 - 25 kgs",
        puppyLifeExpectancy = "12 - 15 years",
        puppyTemperament = "Friendly, Curious, Merry"
    ),
    PuppyModel(
        puppyId = 2,
        puppyName = "German Shepherd",
        puppyImageRes = R.drawable.german_shepherd_puppy,
        puppyGroup = "Working Group",
        puppyHeight = "24 – 26 inches (male), 22 – 24 inches (female)",
        puppyWeight = "55 – 75 pounds (25 – 35 kgs)",
        puppyLifeExpectancy = "9 – 13 years",
        puppyTemperament = "Affectionate, Loyal, Courageous"
    ),
    PuppyModel(
        puppyId = 3,
        puppyName = "Great Dane",
        puppyImageRes = R.drawable.great_dane_puppy,
        puppyGroup = "Working Group",
        puppyHeight = "30 – 32 inches (male), 28 – 30 inches (female)",
        puppyWeight = "110 – 175 pounds (25 – 40 kgs)",
        puppyLifeExpectancy = "10 – 12 years",
        puppyTemperament = "Bright, Fun-Loving, Active"
    ),
    PuppyModel(
        puppyId = 4,
        puppyName = "Boxer",
        puppyImageRes = R.drawable.boxer_puppy,
        puppyGroup = "Working Group",
        puppyHeight = "23 - 25 inches (male), 21.5 - 23.5 inches (female)",
        puppyWeight = "50 – 80 pounds (60 – 80 kgs)",
        puppyLifeExpectancy = "7 – 10 years",
        puppyTemperament = "Friendly, Patient, Dependable"
    ),
    PuppyModel(
        puppyId = 5,
        puppyName = "Labrador Retriever",
        puppyImageRes = R.drawable.labrador_retriever_puppy,
        puppyGroup = "Sporting Group",
        puppyHeight = "22.5 – 24.5 inches (male), 21.5 – 23.5 inches (female)",
        puppyWeight = "55 – 80 pounds (65 – 80 kgs)",
        puppyLifeExpectancy = "10 – 12 years",
        puppyTemperament = "Friendly, Active, Outgoing"
    ),
    PuppyModel(
        puppyId = 6,
        puppyName = "Rottweiler",
        puppyImageRes = R.drawable.rottweiler_puppy,
        puppyGroup = "Utility Group",
        puppyHeight = "24 - 26 inches",
        puppyWeight = "90 – 110 pounds (40 – 50 kgs)",
        puppyLifeExpectancy = "8 – 10 years",
        puppyTemperament = "Good-Natured, Self Assured, Courageous"
    ),
    PuppyModel(
        puppyId = 7,
        puppyName = "Pug",
        puppyImageRes = R.drawable.pug_puppy,
        puppyGroup = "Toy Group",
        puppyHeight = "11 – 13 inches",
        puppyWeight = "15 – 18 pounds (11 – 16 kg)",
        puppyLifeExpectancy = "12 – 15 years",
        puppyTemperament = "Charming, Playful, Stubborn"
    ),
    PuppyModel(
        puppyId = 8,
        puppyName = "Golden Retriever",
        puppyImageRes = R.drawable.golden_retriever_puppy,
        puppyGroup = "Sporting Group",
        puppyHeight = "20 – 24 inches",
        puppyWeight = "55 – 75 pounds (25 – 35 kg)",
        puppyLifeExpectancy = "12 – 15 years",
        puppyTemperament = "Friendly, Intelligent, Devoted"
    ),
    PuppyModel(
        puppyId = 9,
        puppyName = "Cocker Spaniel",
        puppyImageRes = R.drawable.cocker_spaniel_puppy,
        puppyGroup = "Sporting Group",
        puppyHeight = "13 – 16 inches",
        puppyWeight = "20 – 30 pounds (25 – 35 kg)",
        puppyLifeExpectancy = "10 – 14 years",
        puppyTemperament = "Gentle, Smart, Happy"
    ),
    PuppyModel(
        puppyId = 10,
        puppyName = "Dachshund",
        puppyImageRes = R.drawable.daschund_puppy,
        puppyGroup = "Hound Group",
        puppyHeight = "8 - 9 inches (Miniature); 13 - 16 inches (standard)",
        puppyWeight = "11 pounds (Miniature); 16 – 32 pounds (standard)",
        puppyLifeExpectancy = "10 – 14 years",
        puppyTemperament = "Lively, Stubborn, Clever and Courageous"
    )
)
