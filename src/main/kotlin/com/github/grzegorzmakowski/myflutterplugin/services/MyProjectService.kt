package com.github.grzegorzmakowski.myflutterplugin.services

import com.intellij.openapi.project.Project
import com.github.grzegorzmakowski.myflutterplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
