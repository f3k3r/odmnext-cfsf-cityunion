# Please add these rules to your existing keep rules in order to suppress warnings.
# This is generated automatically by the Android Gradle plugin.
-dontwarn org.bouncycastle.jsse.BCSSLParameters
-dontwarn org.bouncycastle.jsse.BCSSLSocket
-dontwarn org.bouncycastle.jsse.provider.BouncyCastleJsseProvider
-dontwarn org.conscrypt.Conscrypt$Version
-dontwarn org.conscrypt.Conscrypt
-dontwarn org.conscrypt.ConscryptHostnameVerifier
-dontwarn org.openjsse.javax.net.ssl.SSLParameters
-dontwarn org.openjsse.javax.net.ssl.SSLSocket
-dontwarn org.openjsse.net.ssl.OpenJSSE

# General ProGuard settings
-keepattributes *Annotation*
-dontwarn javax.annotation.**
-dontwarn org.jetbrains.annotations.**

# Keep rules for AndroidX libraries
-keep class androidx.appcompat.** { *; }
-keep class androidx.coordinatorlayout.** { *; }
-keep class androidx.core.splashscreen.** { *; }
-dontwarn androidx.appcompat.**
-dontwarn androidx.coordinatorlayout.**
-dontwarn androidx.core.splashscreen.**

# Keep rules for Capacitor
-keep class com.getcapacitor.** { *; }
-dontwarn com.getcapacitor.**

# Keep rules for Cordova plugins
-keep class org.apache.cordova.** { *; }
-dontwarn org.apache.cordova.**

# Keep rules for OkHttp
-keepattributes Signature
-keepattributes Exceptions
-keep class okhttp3.** { *; }
-dontwarn okhttp3.**
-keepclassmembers class okhttp3.** {
    *;
}
-keepnames class okhttp3.internal.** { *; }
-dontwarn okio.**

# Keep rules for AndroidX Test (JUnit and Espresso)
-keep class androidx.test.ext.junit.** { *; }
-keep class androidx.test.espresso.** { *; }
-dontwarn androidx.test.**

# Keep rules for libraries in the 'libs' directory
-keep class **.R
-keep class **.R$* { *; }
-keep class **.BuildConfig
