# PowerTunnel
Simple, scalable, cross-platform and effective solution against government censorship

PowerTunnel is more than a regular anti-censorship utility - using it, you can control your traffic and block any connections, for example, for advertising.

Designed for use in Russia, but can be used in other countries.

Wiki: https://github.com/krlvm/PowerTunnel/wiki/

###### PowerTunnel in action
![PowerTunnel in action: UI](https://raw.githubusercontent.com/krlvm/PowerTunnel/master/ui.png "User Interface")
![PowerTunnel in action: Logs](https://raw.githubusercontent.com/krlvm/PowerTunnel/master/log.png "Logs")

### What is it
Nowadays many governments introducing censorship in the Internet and situation with Internet freedom becomes worse every day. DPI - Deep Packet Inspection systems - helps them do this.

This force the people to use ways to bypass locks like Proxy and VPN, that send your Internet traffic to the third parties and may be unstable.

PowerTunnel is active DPI circumvention utility, that works only on your PC and don't send your traffic to third-party servers, respecting your privacy and isn't slowing down your internet connection.

### How it works?
PowerTunnel establishes a HTTP/HTTPS-proxy on the your PC and directs your traffic through it.

More details on the Wiki: https://github.com/krlvm/PowerTunnel/wiki/How-it-works%3F

## How I can get it?
You can compile yourself or download prepared binary from the `Releases` tab.

## Setup
Please, look at the Wiki: https://github.com/krlvm/PowerTunnel/wiki/Installation

## Launch arguments
You can specify a few params through the CLI (v1.4+):

```
java -jar PowerTunnel.jar
-help - displays help
-start - starts server right after load
-console - console mode, without UI
-full-chunking - enables chunking the whole packets
-mix-host-case - enables 'Host' header case mix (unstable)
-chunk-size [Size] - sets chunk size, minimum is 1, default is 5
-ip [IP Address]
-port [Port]
-disable-native-lf - disables native L&F (when UI enabled)
-disable-ui-scaling - disables UI scaling (when UI enabled)
-disable-updater - disables the update notifier
-debug
```

## Not working
Your ISP using another blocking method, that PowerTunnel cannot bypass right now.

Also, you can try launching the program with `-full-chunking` argument.

If you have offers, improvements or find bug you can leave an issue.

## Dependencies
We're using patched LittleProxy (`org.littleshoot:littleproxy:1.1.2`, https://github.com/adamfisk/LittleProxy) as a Proxy Server.

We're using SwingDPI (https://github.com/krlvm/SwingDPI) for scaling UI on a HiDPI screens.
