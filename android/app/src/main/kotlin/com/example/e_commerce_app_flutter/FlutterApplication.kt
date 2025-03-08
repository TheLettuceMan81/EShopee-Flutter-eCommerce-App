package com.example.e_commerce_app_flutter

import io.flutter.app.FlutterApplication
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback
import io.flutter.plugins.GeneratedPluginRegistrant
import io.flutter.plugins.firebaseauth.FirebaseAuthPlugin

class FlutterApplication : FlutterApplication(), PluginRegistrantCallback {
    override fun registerWith(registry: PluginRegistry?) {
        if (registry != null) {
            GeneratedPluginRegistrant.registerWith(FlutterEngine(this))
        }
    }
}
