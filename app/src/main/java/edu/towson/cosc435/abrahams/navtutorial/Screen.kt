package edu.towson.cosc435.abrahams.navtutorial

sealed class Screen(val route: String){
    //each object inherits from screen
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen")
}
