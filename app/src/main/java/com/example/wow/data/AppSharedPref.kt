package com.example.wow.data

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class AppSharedPref @Inject constructor(@ApplicationContext context: Context) : SharedPreferences {

    private var editor: SharedPreferences.Editor

    init {
        val pref: SharedPreferences = context.applicationContext
            .getSharedPreferences(SHER_PREF_NAME, MODE_PRIVATE)
        editor = pref.edit()
    }

    override fun getAll(): MutableMap<String, *> {
        return all
    }

    override fun getStringSet(key: String?, defValues: MutableSet<String>?): MutableSet<String> {
        return getStringSet(key, defValues)
    }

    override fun getString(key: String?, defValue: String?): String? {
        return getString(key, defValue)
    }

    fun storeString(key: String, value: String) {
        editor.putString(key, value)
        editor.commit()
    }

    override fun getInt(key: String?, defValue: Int): Int {
        return getInt(key, defValue)
    }

    override fun getFloat(key: String?, defValue: Float): Float {
        return getFloat(key, defValue)
    }

    override fun getBoolean(key: String?, defValue: Boolean): Boolean {
        return getBoolean(key, defValue)
    }

    override fun getLong(key: String?, defValue: Long): Long {
        return getLong(key, defValue)
    }

    override fun contains(key: String?): Boolean {
        return contains(key)
    }

    override fun edit(): SharedPreferences.Editor {
        return editor
    }

    override fun unregisterOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener?) {
        // do nothing
    }

    override fun registerOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener?) {
        // do nothing
    }

    companion object {
        private const val SHER_PREF_NAME = "wow_app_share_pref"
    }
}
