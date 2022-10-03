plugins {
    id("android-template-script")
}

dependencies {
    if (project.name != project(":android:module").name) {
        "implementation"(project(":android:module"))
    }
}

project(":android").dependencies.add("implementation", project)