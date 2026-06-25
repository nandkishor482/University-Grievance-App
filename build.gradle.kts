// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false

    // YEH LINE ADD KAREIN: Firebase ko project se jodne ke liye
    id("com.google.gms.google-services") version "4.4.1" apply false
}