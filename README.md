# Hound

It is a portable malware analysis suite based on Java.
Portable alternative(Java version) to yara
Hound works on the same principle as that of yara... It has not been created to replace yara, but is to be treated as a portable counterpart of yara, as it doesn't require to be set up in the computer separately... You have to create a file which contains malware strings of yara, each separated by a new line and mention the location of the signature file and its size in bytes in the input after entering the location of the suspected file, and its size in bytes. Hound depends on:                 1.The location and size of the suspected file                                                                                 2.The location and size of the database file which contains the yara string signatures, one per line
