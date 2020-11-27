const dbConfig = require('../knexfile.js')
const knex = require('knex')(dbConfig)

async function getQuery(query){
	try {
		/*
		select * from projeto
		inner join squad as s on (s.id = projeto.equipe)
		*/
		let data
		await knex.raw(query)
		.then(curComp => {data = curComp}).catch(err => console.log(err))
		return data
	} catch (error) {
		throw new Error(error)
	}
}

getQuery('select * from company')
	.then(data => {
		console.log(data.rows)
	})
	.catch()
