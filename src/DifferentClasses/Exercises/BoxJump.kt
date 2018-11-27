package DifferentClasses.Exercises

abstract class BoxJump (name:String = "Box Jump",
               difficulty:Int = 2,
               requirement:String = "Un objeto elevado que aguante tu peso y Piernas",
        //qué parte del cuerpo ejercita
               type: String = "Pierna",
               description: String = "Consiste en saltar un objeto con superficie plana con una medicion predeterminada (de un minimo de 25 pulgadas de alto).")
    :BoxJump(name, difficulty, requirement, type, description){
}