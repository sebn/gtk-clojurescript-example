(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'hello.core
   :output-to "hello.js"
   :optimizations :whitespace})
