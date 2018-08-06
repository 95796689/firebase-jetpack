/*
 * Copyright 2018 Google LLC
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

package com.hyperaware.android.firebasejetpack.repo

import java.util.*

abstract class BaseStockRepository : StockRepository {

    override val allTickers: SortedSet<String> = sortedSetOf(
        "HSTK", "FBAS",
        "QIX",  "GORF", "ZAXN", "PCMN", "GLXN",
        "VGTA", "GOKU", "BLMA", "GOHN", "FRZA", "CELL", "BUU",
        "MCOY", "SPOK", "KIRK", "UHRA", "CHKV", "SULU"
    )

}