import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskContainer


import org.yaml.snakeyaml.Yaml

class ConfigCheckerPlugin implements Plugin<Project> {
    void apply(Project project) {

            ConfigCheckerPluginExtension extension = project.extensions.create("ConfigCheckerSettings", ConfigCheckerPluginExtension)

            TaskContainer tasks = project.getTasks()
            ConfigCheckerTask configTask = tasks.create('ConfigCheckerTask', ConfigCheckerTask.class,extension, false)

            tasks.findByName('test').dependsOn(configTask)
    }
}
