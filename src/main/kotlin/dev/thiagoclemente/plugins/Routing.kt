package dev.thiagoclemente.plugins

import dev.thiagoclemente.routes.customerRouting
import dev.thiagoclemente.routes.getOrderRoute
import dev.thiagoclemente.routes.listOrdersRoute
import dev.thiagoclemente.routes.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
