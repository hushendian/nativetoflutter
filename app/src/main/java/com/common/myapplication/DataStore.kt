package com.common.myapplication

import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

object DataStore {

    val EXAMPLE_COUNTER = intPreferencesKey("example_counter")

    fun getInt(): Flow<Int> {

        return SettingsDataStore.dataStore.data.map {
            it[EXAMPLE_COUNTER] ?: 0
        }
    }

    suspend fun setInt(value: Int) {
        SettingsDataStore.dataStore.edit {

            it[EXAMPLE_COUNTER] = value
        }
    }
}