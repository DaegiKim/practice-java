### `String`, `StringBuffer`, `StringBuilder` 의 차이
- https://effectivesquid.tistory.com/entry/String-vs-StringBuffer-vs-StringBuilder?category=628539
- 문자열을 계속 더하거나 갱신할 때에 `String`은 연산이 이루어질 때마다 새로운 객체가 생성되고 이전 객체는 GC 대상이 된다.
- 반면, `StringBuffer`나 `StringBuilder`는 새로운 객체를 생성하지 않고, 기존에 있는 객체의 크기를 증가시키면서 값을 더한다.
- 때문에 `String`은 짧은 문자열을 더할 경우 사용한다.
- `StringBuffer`는 **스레드에 안전**한 프로그램이 필요할 때나, 개발 중인 시스템의 부분이 스레드에 안전한지 모를 경우 사용하면 좋다. (동기화)
- `StringBuilder`는 스레드에 안전한지의 여부와 전혀 관계 없는 프로그램을 개발할 때 사용하면 좋다. (비동기)
---
### String
- 장점: 간단한 사용.
- 단점: 변경하는 연산이 잦을 시 GC 대상이 되는 객체가 많아짐