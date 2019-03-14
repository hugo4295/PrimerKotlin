package mx.edu.tesoem.hugo4295.itics.primerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val vnum1 = num1.text.toString().toInt()
            val vnum2 = num2.text.toString().toInt()
            val suma = vnum1 + vnum2
            resultado.text =  "Resultado ${suma.toString()}"
        }
    }
}
