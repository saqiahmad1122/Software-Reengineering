    public static void UpdateQuality() {
        for (var i = 0; i < Items.Count; i++) {
            String s = Items[i].Name;
            double v = Items[i].SellIn;
            int a = Items[i].Quality;
            if (s != "Aged Brie" && s != "Backstage passes to a TAFKAL80ETC concert") {
                if (a > 0 && s != "Sulfuras, Hand of Ragnaros") {
                        a = a - 1;
                    v = v - 1;
                }
            } else {
                if (a < 50) {
                    a = a + 1;

                    if (s == "Backstage passes to a TAFKAL80ETC concert") {

                        if (v < 11 || v < 6) {
                            if (a < 50) {
                                a = a + 1;
                            }
                        }
                    }
                }
            }
            if (v < 0) {
                if (s != "Aged Brie" && s != "Sulfuras, Hand of Ragnaros" && s != "Backstage passes to a TAFKAL80ETC concert" && a > 0) {
                    a = a - 1;
                }
                    else {
                        a = a - a;
                    }
                } else {
                    if (a < 50) {
                        a = a + 1;
                    }
                }
            }
        }