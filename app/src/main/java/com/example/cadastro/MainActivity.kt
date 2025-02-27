package com.example.cadastro

import android.app.Application
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cadastro.databinding.ActivityMainBinding
import com.example.cadastro.ui.theme.CadastroTheme

class MainActivity : AppCompatActivity() {
    private val activityMainBinding : ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)
        with(activityMainBinding){
            salvarBt.setOnClickListener{
                saveForm()
            }
            limparBt.setOnClickListener{
                clearForm()


            }


        }
    }

    private fun ActivityMainBinding.clearForm() {
        nomeEt.text.clear();

        telefoneEt.text.clear()

        cidadeEt.text.clear()

        emailEt.text.clear()

        mascRb.isChecked = false

        femRb.isChecked = false
    }

    private fun ActivityMainBinding.saveForm() {
        val formulario = Formulario()
        formulario.nome = nomeEt.text.toString()

        formulario.email = emailEt.text.toString()

        formulario.telefone = telefoneEt.text.toString()

        formulario.cidade = cidadeEt.text.toString()

        formulario.unidadeFederal = ufSp.selectedItem.toString()

        if (mascRb.isChecked) {
            formulario.sexo = Sexo.MASCULINO
        } else formulario.sexo = Sexo.FEMININO

        formulario.interesse = interesseCb.isChecked
        Toast.makeText(baseContext, formulario.toString(),Toast.LENGTH_SHORT).show()

        Log.d("Formulario", formulario.toString())
    }


}

