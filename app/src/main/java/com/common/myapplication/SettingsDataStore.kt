package com.common.myapplication

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

object SettingsDataStore {
    private val App.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")
    val dataStore = App.instance.dataStore
}
