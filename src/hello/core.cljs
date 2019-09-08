(ns hello.core)

(set! (.-Gtk js/imports.gi.versions) "3.0")

(def Gtk (.. js/imports -gi -Gtk))
(def toplevel (.. Gtk -WindowType -TOPLEVEL))

(.init Gtk nil)
(let [window (Gtk.Window. #js {:type toplevel})]
  (set! (.-title window) "Hello ClojureScript!")
  (.connect window "destroy" #(.main_quit Gtk))
  (.show window)
  (.main Gtk))
