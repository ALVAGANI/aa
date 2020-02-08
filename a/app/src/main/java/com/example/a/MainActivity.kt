package com.example.a

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.a.*
import org.json.JSONObject
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

//    lateinit var tx1 : EditText
//    lateinit var tx2 : EditText
//    lateinit var tx3 : EditText
//    lateinit var tx4 : EditText
//    lateinit var tx5 : EditText
//    lateinit var tx6 : EditText
//    lateinit var btn1 : Button
//    lateinit var btn2 : Button
//    private var mrequestQueue: RequestQueue?=null
//    private var context: Context?=null

    val insert = "http://192.168.43.217/b/insert.php";
    val show = "http://192.168.43.217/b/show.php";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a)

        val jsonobj = JSONObject()

//        tx1 = findViewById<View>(R.id.txNama) as EditText
//        tx2 = findViewById<View>(R.id.txEmail) as EditText
//        tx3 = findViewById<View>(R.id.txNoKartu) as EditText
//        tx4 = findViewById<View>(R.id.txNoPerangkat) as EditText
//        tx5 = findViewById<View>(R.id.txUsername) as EditText
//        tx6 = findViewById<View>(R.id.txPass) as EditText
//
//        btn1 = findViewById<View>(R.id.btnTambah) as Button
//        btn2 = findViewById<View>(R.id.btnLihat) as Button


        btnTambah.setOnClickListener {
            jsonobj.put("nama", txNama.text)
            jsonobj.put("email", txEmail.text)
            jsonobj.put("no kartu", txNoKartu.text)
            jsonobj.put("no perangkat", txNoPerangkat.text)
            jsonobj.put("username", txUsername.text)
            jsonobj.put("password", txPass.text)


            val que = Volley.newRequestQueue(this@MainActivity)
            val req = JsonObjectRequest(Request.Method.POST,insert,null,
                    Response.Listener {
                        response ->
                        toast(response["Sukses"].toString())
                    }, Response.ErrorListener {
                    toast("Something went wrong")
                })
            que.add(req)
        }
        btnLihat.setOnClickListener {

        }
    }


//    private fun Clickme() {
//        val nama = tx1.text.toString()
//        val email = tx2.text.toString()
//        val no_kartu = tx3.text.toString()
//        val no_perangkat = tx4.text.toString()
//        val username = tx5.text.toString()
//        val password = tx6.text.toString()



    }
}
