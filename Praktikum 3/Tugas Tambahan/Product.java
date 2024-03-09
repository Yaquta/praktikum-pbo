// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : Product.java
// Tgl Pembuatan : 8 Maret 2024


public class Product {
    private String name;
    private int stock;
    private int price;

    public Product() {
        this.name = "";
        this.stock = 0;
        this.price = 0;
    }

    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        // Tambahkan kode untuk set atribut name dan berikan asersi jika name yang dimasukkan berupa string kosong
        assert !name.isEmpty() : "Nama product tidak boleh kosong";
        this.name = name;
    }

    public void setStock(int stock) {
        // Tambahkan kode untuk set atribut stock dan berikan asersi bahwa jumlah stock yang dimasukkan harus bilangan positif
        assert stock >= 0 : "Jumlah stock harus positif";
        this.stock = stock;
    }

    public void setPrice(int price) {
        // Tambahkan kode untuk set atribut price dan berikan asersi bahwa jumlah stok yang dimasukkan harus bilangan positif
        assert price >= 0 : "Jumlah stock harus positif";
        this.price = price;
    }

    public void purchaseProduct(int quantity) {
        // Tambahkan kode untuk mengurangi stok produk jika dilakukan pembelian.
        // Berikan asersi dimana quantity yang dimasukkan harus bilangan positif
        // dan berikan juga asersi jika stok produk yang tersedia tidak mencukupi.
        assert quantity > 0 : "Quantity harus bilangan positif";
        assert this.stock >= quantity : "Insufficient stock";
        this.stock -= quantity;
    }

    public void addStock(int quantity) {
        // Tambahkan kode untuk menambah stok produk.
        // Berikan asersi dimana quantity yang dimasukkan harus bilangan positif
        assert quantity > 0 : "Quantity harus bilangan positif";
        this.stock += quantity;
    }
}


