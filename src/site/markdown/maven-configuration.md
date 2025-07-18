
# Configuration Options
<!--
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
-->

<!--
THIS FILE IS GENERATED - DO NOT EDIT
Generated from: apache-maven/src/test/resources/maven-configuration.md.vm
To modify this file, edit the template and regenerate.
-->





| Key | Type | Description | Default Value | Since | Source |
| --- | --- | --- | --- | --- | --- |
| `maven.build.timestamp.format` | `String` | Build timestamp format. |  `yyyy-MM-dd'T'HH:mm:ssXXX`  | 3.0.0 | Model properties |
| `maven.build.version` | `String` | Maven build version: a human-readable string containing this Maven version, buildnumber, and time of its build. |  -  | 3.0.0 | system_properties |
| `maven.builder.maxProblems` | `Integer` | Max number of problems for each severity level retained by the model builder. |  `100`  | 4.0.0 | User properties |
| `maven.consumer.pom` | `Boolean` | User property for enabling/disabling the consumer POM feature. |  `true`  | 4.0.0 | User properties |
| `maven.deploy.buildPom` | `Boolean` | User property for controlling whether build POMs are deployed alongside consumer POMs. When set to <code>false</code>, only the consumer POM will be deployed, and the build POM will be excluded from deployment. This is useful to avoid deploying internal build information that is not needed by consumers of the artifact. <br/> Default: <code>"true"</code>. |  `true`  | 4.1.0 | User properties |
| `maven.deploy.snapshot.buildNumber` | `Integer` | User property for overriding calculated "build number" for snapshot deploys. Caution: this property should be RARELY used (if used at all). It may help in special cases like "aligning" a reactor build subprojects build numbers to perform a "snapshot lock down". Value given here must be <code>maxRemoteBuildNumber + 1</code> or greater, otherwise build will fail. How the number to be obtained is left to user (ie by inspecting snapshot repository metadata or alike). Note: this feature is present in Maven 3.9.7 but with different key: <code>maven.buildNumber</code>. In Maven 4 as part of cleanup effort this key was renamed to properly reflect its purpose. |  -  | 4.0.0 | User properties |
| `maven.ext.class.path` | `String` | Extensions class path. |  -  |  | User properties |
| `maven.home` | `String` | Maven home. |  -  | 3.0.0 | system_properties |
| `maven.installation.conf` | `String` | Maven installation configuration directory. |  `${maven.home}/conf`  | 4.0.0 | User properties |
| `maven.installation.extensions` | `String` | Maven installation extensions. |  `${maven.installation.conf}/extensions.xml`  | 4.0.0 | User properties |
| `maven.installation.settings` | `String` | Maven installation settings. |  `${maven.installation.conf}/settings.xml`  | 4.0.0 | User properties |
| `maven.installation.toolchains` | `String` | Maven installation toolchains. |  `${maven.installation.conf}/toolchains.xml`  | 4.0.0 | User properties |
| `maven.logger.cacheOutputStream` | `Boolean` | If the output target is set to "System.out" or "System.err" (see preceding entry), by default, logs will be output to the latest value referenced by System.out/err variables. By setting this parameter to true, the output stream will be cached, i.e. assigned once at initialization time and re-used independently of the current value referenced by System.out/err. |  `false`  | 4.0.0 | User properties |
| `maven.logger.dateTimeFormat` | `String` | The date and time format to be used in the output messages. The pattern describing the date and time format is defined by SimpleDateFormat. If the format is not specified or is invalid, the number of milliseconds since start up will be output. |  -  | 4.0.0 | User properties |
| `maven.logger.defaultLogLevel` | `String` | Default log level for all instances of SimpleLogger. Must be one of ("trace", "debug", "info", "warn", "error" or "off"). If not specified, defaults to "info". |  -  | 4.0.0 | User properties |
| `maven.logger.levelInBrackets` | `Boolean` | Should the level string be output in brackets? Defaults to false. |  `false`  | 4.0.0 | User properties |
| `maven.logger.logFile` | `String` | The output target which can be the path to a file, or the special values "System.out" and "System.err". Default is "System.err". |  -  | 4.0.0 | User properties |
| `maven.logger.showDateTime` | `Boolean` | Set to true if you want the current date and time to be included in output messages. Default is false. |  `false`  | 4.0.0 | User properties |
| `maven.logger.showLogName` | `Boolean` | Set to true if you want the Logger instance name to be included in output messages. Defaults to true. |  `true`  | 4.0.0 | User properties |
| `maven.logger.showShortLogName` | `Boolean` | Set to true if you want the last component of the name to be included in output messages. Defaults to false. |  `false`  | 4.0.0 | User properties |
| `maven.logger.showThreadId` | `Boolean` | If you would like to output the current thread id, then set to true. Defaults to false. |  `false`  | 4.0.0 | User properties |
| `maven.logger.showThreadName` | `Boolean` | Set to true if you want to output the current thread name. Defaults to true. |  `true`  | 4.0.0 | User properties |
| `maven.logger.warnLevelString` | `String` | The string value output for the warn level. Defaults to WARN. |  `WARN`  | 4.0.0 | User properties |
| `maven.maven3Personality` | `Boolean` | User property for controlling "maven personality". If activated Maven will behave as previous major version, Maven 3. |  `false`  | 4.0.0 | User properties |
| `maven.modelBuilder.parallelism` | `Integer` | ProjectBuilder parallelism. |  `cores/2 + 1`  | 4.0.0 | User properties |
| `maven.plugin.validation` | `String` | Plugin validation level. |  `inline`  | 3.9.2 | User properties |
| `maven.plugin.validation.excludes` | `String` | Plugin validation exclusions. |  -  | 3.9.6 | User properties |
| `maven.project.conf` | `String` | Maven project configuration directory. |  `${session.rootDirectory}/.mvn`  | 4.0.0 | User properties |
| `maven.project.extensions` | `String` | Maven project extensions. |  `${maven.project.conf}/extensions.xml`  | 4.0.0 | User properties |
| `maven.project.settings` | `String` | Maven project settings. |  `${maven.project.conf}/settings.xml`  | 4.0.0 | User properties |
| `maven.relocations.entries` | `String` | User controlled relocations. This property is a comma separated list of entries with the syntax <code>GAV&gt;GAV</code>. The first <code>GAV</code> can contain <code>\*</code> for any elem (so <code>\*:\*:\*</code> would mean ALL, something you don't want). The second <code>GAV</code> is either fully specified, or also can contain <code>\*</code>, then it behaves as "ordinary relocation": the coordinate is preserved from relocated artifact. Finally, if right hand <code>GAV</code> is absent (line looks like <code>GAV&gt;</code>), the left hand matching <code>GAV</code> is banned fully (from resolving). <br/> Note: the <code>&gt;</code> means project level, while <code>&gt;&gt;</code> means global (whole session level, so even plugins will get relocated artifacts) relocation. <br/> For example, <pre>maven.relocations.entries = org.foo:\*:\*>, \\<br/>    org.here:\*:\*>org.there:\*:\*, \\<br/>    javax.inject:javax.inject:1>>jakarta.inject:jakarta.inject:1.0.5</pre> means: 3 entries, ban <code>org.foo group</code> (exactly, so <code>org.foo.bar</code> is allowed), relocate <code>org.here</code> to <code>org.there</code> and finally globally relocate (see <code>&gt;&gt;</code> above) <code>javax.inject:javax.inject:1</code> to <code>jakarta.inject:jakarta.inject:1.0.5</code>. |  -  | 4.0.0 | User properties |
| `maven.repo.central` | `String` | Maven central repository URL. The property will have the value of the <code>MAVEN_REPO_CENTRAL</code> environment variable if it is defined. |  `https://repo.maven.apache.org/maven2`  | 4.0.0 | User properties |
| `maven.repo.local` | `String` | Maven local repository. |  `${maven.user.conf}/repository`  | 3.0.0 | User properties |
| `maven.repo.local.head` | `String` | User property for chained LRM: the new "head" local repository to use, and "push" the existing into tail. Similar to <code>maven.repo.local.tail</code>, this property may contain comma separated list of paths to be used as local repositories (combine with chained local repository), but while latter is "appending" this one is "prepending". |  -  | 4.0.0 | User properties |
| `maven.repo.local.recordReverseTree` | `String` | User property for reverse dependency tree. If enabled, Maven will record ".tracking" directory into local repository with "reverse dependency tree", essentially explaining WHY given artifact is present in local repository. Default: <code>false</code>, will not record anything. |  `false`  | 3.9.0 | User properties |
| `maven.repo.local.tail` | `String` | User property for chained LRM: list of "tail" local repository paths (separated by comma), to be used with <code>org.eclipse.aether.util.repository.ChainedLocalRepositoryManager</code>. Default value: <code>null</code>, no chained LRM is used. |  -  | 3.9.0 | User properties |
| `maven.repo.local.tail.ignoreAvailability` | `String` | User property for chained LRM: whether to ignore "availability check" in tail or not. Usually you do want to ignore it. This property is mapped onto corresponding Resolver 2.x property, is like a synonym for it. Default value: <code>true</code>. |  -  | 3.9.0 | User properties |
| `maven.resolver.dependencyManagerTransitivity` | `String` | User property for selecting dependency manager behaviour regarding transitive dependencies and dependency management entries in their POMs. Maven 3 targeted full backward compatibility with Maven2, hence it ignored dependency management entries in transitive dependency POMs. Maven 4 enables "transitivity" by default, hence unlike Maven2, obeys dependency management entries deep in dependency graph as well. <br/> Default: <code>"true"</code>. |  `true`  | 4.0.0 | User properties |
| `maven.resolver.transport` | `String` | Resolver transport to use. Can be <code>default</code>, <code>wagon</code>, <code>apache</code>, <code>jdk</code> or <code>auto</code>. |  `default`  | 4.0.0 | User properties |
| `maven.session.versionFilter` | `String` | User property for version filter expression used in session, applied to resolving ranges: a semicolon separated list of filters to apply. By default, no version filter is applied (like in Maven 3). <br/> Supported filters: <ul> <li>"h" or "h(num)" - highest version or top list of highest ones filter</li> <li>"l" or "l(num)" - lowest version or bottom list of lowest ones filter</li> <li>"s" - contextual snapshot filter</li> <li>"e(G:A:V)" - predicate filter (leaves out G:A:V from range, if hit, V can be range)</li> </ul> Example filter expression: <code>"h(5);s;e(org.foo:bar:1)</code> will cause: ranges are filtered for "top 5" (instead full range), snapshots are banned if root project is not a snapshot, and if range for <code>org.foo:bar</code> is being processed, version 1 is omitted. Value in this property builds <code>org.eclipse.aether.collection.VersionFilter</code> instance. |  -  | 4.0.0 | User properties |
| `maven.settings.security` | `String` |  |  `${maven.user.conf}/settings-security4.xml`  |  | User properties |
| `maven.startInstant` | `java.time.Instant` | User property used to store the build timestamp. |  -  | 4.0.0 | User properties |
| `maven.style.color` | `String` | Maven output color mode. Allowed values are <code>auto</code>, <code>always</code>, <code>never</code>. |  `auto`  | 4.0.0 | User properties |
| `maven.style.debug` | `String` | Color style for debug messages. |  `bold,f:cyan`  | 4.0.0 | User properties |
| `maven.style.error` | `String` | Color style for error messages. |  `bold,f:red`  | 4.0.0 | User properties |
| `maven.style.failure` | `String` | Color style for failure messages. |  `bold,f:red`  | 4.0.0 | User properties |
| `maven.style.info` | `String` | Color style for info messages. |  `bold,f:blue`  | 4.0.0 | User properties |
| `maven.style.mojo` | `String` | Color style for mojo messages. |  `f:green`  | 4.0.0 | User properties |
| `maven.style.project` | `String` | Color style for project messages. |  `f:cyan`  | 4.0.0 | User properties |
| `maven.style.strong` | `String` | Color style for strong messages. |  `bold`  | 4.0.0 | User properties |
| `maven.style.success` | `String` | Color style for success messages. |  `bold,f:green`  | 4.0.0 | User properties |
| `maven.style.trace` | `String` | Color style for trace messages. |  `bold,f:magenta`  | 4.0.0 | User properties |
| `maven.style.transfer` | `String` | Color style for transfer messages. |  `f:bright-black`  | 4.0.0 | User properties |
| `maven.style.warning` | `String` | Color style for warning messages. |  `bold,f:yellow`  | 4.0.0 | User properties |
| `maven.user.conf` | `String` | Maven user configuration directory. |  `${user.home}/.m2`  | 4.0.0 | User properties |
| `maven.user.extensions` | `String` | Maven user extensions. |  `${maven.user.conf}/extensions.xml`  | 4.0.0 | User properties |
| `maven.user.settings` | `String` | Maven user settings. |  `${maven.user.conf}/settings.xml`  | 4.0.0 | User properties |
| `maven.user.toolchains` | `String` | Maven user toolchains. |  `${maven.user.conf}/toolchains.xml`  | 4.0.0 | User properties |
| `maven.version` | `String` | Maven version. |  -  | 3.0.0 | system_properties |
| `maven.version.major` | `String` | Maven major version: contains the major segment of this Maven version. |  -  | 4.0.0 | system_properties |
| `maven.version.minor` | `String` | Maven minor version: contains the minor segment of this Maven version. |  -  | 4.0.0 | system_properties |
| `maven.version.patch` | `String` | Maven patch version: contains the patch segment of this Maven version. |  -  | 4.0.0 | system_properties |
| `maven.version.snapshot` | `String` | Maven snapshot: contains "true" if this Maven is a snapshot version. |  -  | 4.0.0 | system_properties |
| `maven.versionRangeResolver.natureOverride` | `String` | Configuration property for version range resolution used metadata "nature". It may contain following string values: <ul> <li>"auto" - decision done based on range being resolver: if any boundary is snapshot, use "release_or_snapshot", otherwise "release"</li> <li>"release_or_snapshot" - the default</li> <li>"release" - query only release repositories to discover versions</li> <li>"snapshot" - query only snapshot repositories to discover versions</li> </ul> Default (when unset) is existing Maven behaviour: "release_or_snapshots". |  `release_or_snapshot`  | 4.0.0 | User properties |
| `maven.versionResolver.noCache` | `Boolean` | User property for disabling version resolver cache. |  `false`  | 3.0.0 | User properties |

