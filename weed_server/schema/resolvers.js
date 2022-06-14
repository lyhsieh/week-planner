const { FruitEventList } = require("../FakeData");
const _ = require("lodash");

const resolvers = {
  Query: {
    // Get fruit events
    getFruitEvents: () => {
      return FruitEventList;
    }
  },

  Mutation: {
    uploadFruitEvent: (parent, args) => {
      const lastId = FruitEventList[FruitEventList.length - 1].id;
      id = lastId + 1;
      FruitEventList.push({
        id: id,
        username: args.userName,
        fruit: args.fruit,
      });
      return FruitEventList[FruitEventList.length - 1];
    },
  },

};

module.exports = { resolvers };
