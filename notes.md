# Clojure

## Getting started with a fighweel project

* lein new reagent myapp5
* Start spacemacs
* Open the project.clj
* start repl

```
SPC m s i
```

* expect to see:

```
myapp5.repl>
```

* now we need to start the server

```
(start-server)
```

* now we need to star the figwheel sidecar

```
myapp5.repl> (use 'figwheel-sidecar.repl-api)
nil
```

* now we need to start figwheel itself

```
myapp5.repl> (start-figwheel!)
Figwheel: Starting server at http://0.0.0.0:3449
Figwheel: Watching build - app
Figwheel: Cleaning build - app
Compiling build :app to "target/cljsbuild/public/js/app.js" from ["src/cljs" "src/cljc" "env/dev/cljs"]...
Successfully compiled build :app to "target/cljsbuild/public/js/app.js" in 13.537 seconds.
Figwheel: Starting CSS Watcher for paths  ["resources/public/css"]
Figwheel: Starting nREPL server on port: 7002
nil
```

* to use the cljs repl, you need to change namespaces

```
(cljs-repl)
```
