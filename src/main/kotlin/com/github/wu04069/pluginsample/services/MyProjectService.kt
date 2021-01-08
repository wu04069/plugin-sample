package com.github.wu04069.pluginsample.services

import com.intellij.openapi.project.Project
import com.github.wu04069.pluginsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
