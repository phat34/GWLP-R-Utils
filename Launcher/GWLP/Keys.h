#pragma once

/**
* Keys for Key exchange (need to be injected since the server doesn't send its public key to the client)
* Generate with Keygen or use this ones
* If you change these modify KeyExchange.dll as well !!!!
**/

static unsigned char P[] = {0xBB, 0xF6, 0xC0, 0x97, 0xD4, 0x07, 0x1B, 0x78, 0xA7, 0xDD, 0xD8, 0x20, 0x99, 0x99, 0x55, 0x42, 0x5C, 0xD6, 0x8C, 0xDB, 0x3B, 0xBD, 0x61, 0x91,
0xF4, 0xA4, 0x6D, 0x4D, 0x8E, 0x29, 0x5D, 0x90, 0xD7, 0xA1, 0xA5, 0x0C, 0xC9, 0x7E, 0x3E, 0x45, 0x7A, 0xC0, 0x9C, 0x1C, 0x59, 0x96, 0xD3, 0xFA, 
0x6D, 0x1D, 0x94, 0x7B, 0x07, 0xEF, 0x0A, 0xD8, 0xB7, 0xEE, 0x7F, 0x8C, 0x1E, 0x42, 0x74, 0xEB};

static unsigned char PublicServerKey[] = {0xC3, 0xA2, 0x0C, 0xE0, 0x72, 0x21, 0xAE, 0xF5, 0xAE, 0x1A, 0x36, 0xD5, 0x35, 0x23, 0xC3, 0x0D, 0x74, 0x21, 0x15, 0x06, 0x63, 0x8F, 0x38,
0x6B, 0x83, 0x7E, 0x6A, 0x3C, 0xFE, 0x51, 0xD0, 0x13, 0x69, 0x40, 0xE9, 0x3E, 0x49, 0x80, 0x37, 0x8B, 0xF4, 0x88, 0x86, 0x48, 0x59, 0x64, 0x86,
0x3D, 0x43, 0xD0, 0x7A, 0x59, 0xE5, 0x58,0x91, 0x24, 0x8D, 0x23, 0x2C, 0x4C, 0x28, 0x8F, 0xAF, 0xA1};

static unsigned char G[] = {0x04, 0x00, 0x00, 0x00};