package com.example.myapplicationbottomnavigationbar

sealed class Screens(val screen:String){
    data object Home:Screens("Home")
    data object Profile:Screens("Profile")
    data object Search:Screens("Search")
    data object Notification:Screens("Notification")
}