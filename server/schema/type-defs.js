const { gql } = require("apollo-server");

const typeDefs = gql`
  type FruitEvent {
    id: ID!
    username: String!
    fruit: String!
  }

  type Query {
    getFruitEvents: [FruitEvent!]
  }

  input CreateFruitEvent {
    id: ID
    username: String!
    fruit: String!
  }

  type Mutation {
    uploadFruitEvent( userName: String!, fruit: String! ): FruitEvent
  }
`;

module.exports = { typeDefs };
