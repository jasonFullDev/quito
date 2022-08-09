package com.rnmqtt.models.rnevents

enum class RnMqttEvent {
  MQTT_EXCEPTION,
  MQTT_RECONNECT,
  MQTT_CONNECTING,
  MQTT_CONNECTED,
  MQTT_DISCONNECTED,
  MQTT_SUBSCRIBED,
  MQTT_UNSUBSCRIBED,
  MQTT_CONNECTION_LOST,
  MQTT_MESSAGE_ARRIVED,
  MQTT_MESSAGE_PUBLISHED,
  MQTT_DELIVERY_COMPLETE,
  MQTT_CONNECTION_COMPLETE,
  MQTT_CLIENT_REF_UNKNOWN
}
