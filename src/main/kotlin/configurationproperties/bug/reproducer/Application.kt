package configurationproperties.bug.reproducer

import io.micronaut.context.ApplicationContext
import javax.inject.Singleton

fun main(args: Array<String>)  {
	ApplicationContext.run().use { context ->
		context.getBean(Application::class.java).start()
	}
}


@Singleton
class Application(private val fleetSessionStatusPeriodicNotifier: FleetSessionStatusPeriodicNotifier) {

	fun start() {
		fleetSessionStatusPeriodicNotifier.start()
	}

}