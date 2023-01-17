package convertedin.pixel.sdk

import android.content.Context
import android.widget.Toast

class Utils {

    fun showToast(context:Context , token:String){
        Toast.makeText(context, "SDKs -> $token",+Toast.LENGTH_LONG).show()
    }
}