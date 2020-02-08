package com.example.a

import android.content.Context
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class MyVolleyRequest {
    private var mrequestQueue: RequestQueue?=null
    private var context: Context?=null


    val requestQueue:RequestQueue
        get() {
            if(mrequestQueue == null)
                mrequestQueue = Volley.newRequestQueue(context!!.applicationContext)
            return mrequestQueue!!
        }

}