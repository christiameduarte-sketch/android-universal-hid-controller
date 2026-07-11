package com.controle.universal

object HidDescriptor {
    // Descritor de relatório HID (Gamepad Padrão)
    val GAMEPAD_REPORT_DESCRIPTOR = byteArrayOf(
        0x05, 0x01, // Usage Page (Desktop)
        0x09, 0x05, // Usage (Gamepad)
        0xA1, 0x01, // Collection (Application)
        0x05, 0x09, // Usage Page (Button)
        0x19, 0x01, // Usage Minimum (Button 1)
        0x29, 0x10, // Usage Maximum (Button 16)
        0x15, 0x00, // Logical Minimum (0)
        0x25, 0x01, // Logical Maximum (1)
        0x75, 0x01, // Report Size (1)
        0x95, 0x10, // Report Count (16)
        0x81, 0x02, // Input (Data, Variable, Absolute)
        0x05, 0x01, // Usage Page (Desktop)
        0x09, 0x30, // Usage (X)
        0x09, 0x31, // Usage (Y)
        0x15, 0x00, // Logical Minimum (0)
        0x26, 0xFF, 0x00, // Logical Maximum (255)
        0x75, 0x08, // Report Size (8)
        0x95, 0x02, // Report Count (2)
        0x81, 0x02, // Input (Data, Variable, Absolute)
        0xC0 // End Collection
    )
}
