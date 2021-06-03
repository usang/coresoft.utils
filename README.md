# coresoft.utils

SysOut
- slf4j.MessageFormatter 가 제공하는 simple substitution rule 적용하여 System.out.println 처럼 console 출력을 지원

- 예) SysOut.print(" Hi {}.", "World!!!")

- {} : formatting anchor serves to designate the location where arguments need to be substituted whinin the message pattern.
