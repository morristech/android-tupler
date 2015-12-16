### android-tupler

A simple utility library to create bundles of arbitrary objects .

All resulting zipped objects referred to as a `Tuple#` (semantically incorrect but easier to use).

### Installation

[![Download](https://api.bintray.com/packages/mrkcsc/maven/com.miguelgaeta.tupler/images/download.svg)](https://bintray.com/mrkcsc/maven/com.miguelgaeta.tupler/_latestVersion)

```groovy

compile 'com.miguelgaeta.android-tupler:tupler:1.1.1'

```

### Usage

```java

String a = "a";
String b = "b";
String c = "c";

Tuple2<String, String> tuple2 = Tupler.create(a, b);
Tuple3<String, String, String> tuple3 = Tupler.create(a, b, c);

```

### License

*Copyright 2015 Miguel Gaeta*

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
