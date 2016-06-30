(ns hello.gtk)

(def Gtk (.. js/imports -gi -Gtk))

(def keyword->type
  {:toplevel (.. Gtk -WindowType -TOPLEVEL)})

(defn window [{:keys [type title on-destroy]}]
  (let [w (Gtk.Window. #js {:type (keyword->type type)})]
    (set! (.-title w) title)
    (.connect w "destroy" on-destroy)
    w))

(defn init [x y]
  (.init Gtk x y))

(defn show [w]
  (.show w))

(defn main []
  (.main Gtk))

(defn main-quit []
  (.main_quit Gtk))
