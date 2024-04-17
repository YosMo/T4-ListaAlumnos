package com.example.t4_listaalumnos.viewmodels


import com.example.t4_listaalumnos.models.Alumn

class AlumnViewModels {
    init {}

    fun getAlumnList(): ArrayList<Alumn> {
        var alumnList: ArrayList<Alumn> = ArrayList<Alumn>()

        //Create list
        alumnList.add(Alumn(19475, "Edson Maya", "edson.maya@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.5, 0))
        alumnList.add(Alumn(19508, "Aylin Alvarez", "aylin.alvarez@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.6, 5))
        alumnList.add(Alumn(19523, "Yoselin Mojica", "yoselin.mojica@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", false, 9.1, 0))
        alumnList.add(Alumn(19666, "Sebastián Rubio", "sebastian.rubio@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.85, 0))
        alumnList.add(Alumn(21637, "Josue Arreola", "josue.arreola@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.85, 6))
        alumnList.add(Alumn(21767, "María Fernanda Villarreal", "maria.villarreal02@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.2, 3))
        alumnList.add(Alumn(22098, "Gerardo Torres", "gerardo.torres@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.3, 1))
        alumnList.add(Alumn(22154, "Javier Zapata", "luis.zapata01@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.3, 0))
        alumnList.add(Alumn(22180, "Alfonso Estudiante", "alfonso.madero@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.0, 0))
        alumnList.add(Alumn(22208, "David Rivera", "david.rivera@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.0, 1))
        alumnList.add(Alumn(22210, "Raymundo Gutiérrez", "raymundo.gutierrez@iest.edu.mx", 8, "Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", false, 8.8, 0))

        return alumnList
    }
}