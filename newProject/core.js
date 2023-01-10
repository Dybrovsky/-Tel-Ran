class Product {
    constructor(id, title, manufacture, price) {
        this.id = id;
        this.title = title;
        this.manufacture = manufacture;
        this.price = price;
    }
}

class Milk extends Product {
    constructor(id, title, manufacture, price, fat) {
        super(id, title, manufacture, price);
        this.fat = fat;
    }
}

class Chocolate extends Product {
    constructor(id, title, manufacture, price, kind) {
        super(id, title, manufacture, price);
        this.kind = kind;
    }
}

class Wine extends Product {
    constructor(id, title, manufacture, price, alcohol) {
        super(id, title, manufacture, price);
        this.alcohol = alcohol;
    }
}

class Store {
    constructor() {
        this.array = [];
    }

    add(product) {
        let res = this.array.find(function (p) {
            return p.id === product.id;
        });
        if (!res) {
            this.array.push(product);
            return true;
        } else
            return false;
    }

    getByType(type) {
        if (!type) return this.array;
        switch (type.trim().toLowerCase()) {
            case "milk":
                return this.array.filter(function (p) {
                    return p.constructor === Milk;
                });
            case "chocolate":
                return this.array.filter(function (p) {
                    return p.constructor === Chocolate;
                });
            case "wine":
                return this.array.filter(function (p) {
                    return p.constructor === Wine;
                });
            default:
                return this.array;
        }
    }
}