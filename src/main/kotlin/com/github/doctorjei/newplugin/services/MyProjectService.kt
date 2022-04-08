package com.github.doctorjei.newplugin.services

import com.intellij.openapi.project.Project
import com.github.doctorjei.newplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
