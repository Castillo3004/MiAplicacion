package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variableConstantes()
        tiposDatos()
        sentencias()
        arrays()
    }

    fun variableConstantes(){
        // Creacion de Variables
        var saludo = "Hola Mundo :)";
        saludo = "Bienvenido Carlos"
        println(saludo)

        val constante1 = "Paralelo 1"
        println(constante1)
    }

    fun tiposDatos(){
        val myString1 = "Desarrollo Movil"
        val myString2 = "Bienvenido"
        val myString3 = myString2 + " a la materia de " + myString1

        println(myString3)

        val edad1 = 21
        val edad2 = 3
        val res = edad1 +edad2
        println("La suma de las edades es: "+res)
    }

    fun sentencias(){
        val edad = 18
        if(edad < 18){
            println("Usted es menor de edad")
        }else{
            println("Usted es mayor de edad")
        }

        val pais = "Brasilasf"
        when(pais){
         "Peru","Ecuador¿¿","Colombia" ->{
             println("Hablan español")
         }
            "EEUU" -> {
                println("Hablan ingles")
            }
            "Brasil" -> {
                println("Hablan portugues")
            }else -> println("No hay Lenguaje")
        }
    }

    fun arrays(){
        val nombre = "Carlos"
        val apellido = "Castillo"
        val universidad = "UTPL"
        val edad = "21"

        val myArray = arrayListOf<String>()

        myArray.add(nombre)
        myArray.add(apellido)
        myArray.add(universidad)
        myArray.add(edad)

        println(myArray)

        myArray.addAll(listOf("Hola", "Curso de Android"))
        println(myArray)

        myArray.removeAt(4)
        println(it)
    }

    fun maps(){

    }

}