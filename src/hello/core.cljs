(ns hello.core
  (:require [hello.gtk :as gtk :refer [show]]))

(gtk/init nil 0)

(let [w (gtk/window {:type :toplevel
                     :title "Hello ClojureScript!"
                     :on-destroy gtk/main-quit})]
  (show w)
  (gtk/main))
