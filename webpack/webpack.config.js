const path = require('path')

module.exports = {
    entry: './src/appl.js',
    output: {
        filename: "bundler.js",
        path: path.resolve(__dirname, 'dist')
    },
    mode: "development"
}