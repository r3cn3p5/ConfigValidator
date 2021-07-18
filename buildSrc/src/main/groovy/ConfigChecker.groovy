
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

import javax.inject.Inject

class ConfigCheckerTask extends DefaultTask {

    private ConfigCheckerPluginExtension ConfigCheckerTaskPluginExtension
    private boolean pluginAppliedToRoot

    @Inject
    ConfigCheckerTask(ConfigCheckerPluginExtension ConfigCheckerTaskPluginExtension, boolean pluginAppliedToRoot) {
        this.ConfigCheckerTaskPluginExtension = ConfigCheckerTaskPluginExtension;
        this.pluginAppliedToRoot = pluginAppliedToRoot;
    }

    @TaskAction
    void taskAction() {

        println("Config checker")

        //def dir = new File("${project.projectDir}/${ConfigCheckerTaskPluginExtension.cfgDirectory}")

    }
}