module.exports = {
    api_url: process.env.API_URL || 'http://localhost:3001/api',
    database: process.env.DB_NAME || 'mysquad',
    username: process.env.DB_USERNAME || 'isi_m',
    password: process.env.DB_PASSWORD || 'isi@2021',
    host: process.env.DB_HOST || 'tdevcgen.macieiras.com.br',
    dialect: process.env.DB_DIALECT || 'postgres',
    port: process.env.APP_PORT || 3001
}
