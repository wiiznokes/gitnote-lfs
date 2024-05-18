package io.github.wiiznokes.gitnote.helper

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UiHelper(
    private val context: Context
) {
    fun makeToast(text: String?, duration: Int = Toast.LENGTH_SHORT) {
        if (text == null) return
        CoroutineScope(Dispatchers.Main).launch {
            Toast.makeText(context, text, duration).show()
        }
    }

    fun getString(@StringRes resId: Int): String =
        context.getString(resId)

    fun getString(@StringRes resId: Int, vararg formatArgs: Any?): String {
        return context.getString(resId, *formatArgs)
    }
}